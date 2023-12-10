import java.util.*;

/*The DSatur, or Saturation Degree, algorithm picks an uncolored vertex from a graph that has the biggest number of adjacent
 * vertices that each are colored differently -- meaning that the vertex with the highest saturation is chosen. If all the 
 * uncolored vertices in the graph have the same saturation degree, then the list is narrowed down to the vertex that has 
 * the highest degree, or the highest number of adjacencies. If the vertices have the same saturation degree and the same 
 * number of edges, then any one of those vertices are chosen to color. The colors are number and range from 1, 2, 3, ..., n-1,
 * where n is the total number of vertices. None of the vertices that are adjacent to each other can have the same color.
 * This process continues until all of the vertices are colored in. This algorithm addresses the graph coloring problem and
 * it finds the most efficient coloring scheme for bipartite graphs.
*/
class dSatur_Algorithm {    

    //Need to keep track of the inputted adjacencyMatrix.
    boolean[][] adjacencyMatrix;   

    //Constructor takes in the adjacency matrix
    public dSatur_Algorithm(boolean[][] adjMatrix) {        
        adjacencyMatrix = adjMatrix;
    }

    public int[] dSatur() {  
        //Need an array to keep track of the final coloring of each vertex      
        int[] finalColor = new int[adjacencyMatrix.length];    
        //This keeps track of the degree of each vertex    
        int[] degreeVertex = new int[adjacencyMatrix.length]; 
        //This keeps track of the colors used by vertices adjacent to a vertex.      
        ArrayList<HashSet<Integer>> saturColor = new ArrayList<>();       
      
        //Instantiate a priority queue speciallly designed to handle the properties
        //of this algorithm. A node that has the highest saturation or highest degree is the
        //the node that has the highest priority.
         PriorQueue pq = new PriorQueue(adjacencyMatrix.length); 
         
         //For each vertex, calculate its degree, insert that into degreeVertex, and insert
         //the characteristics of that vertex into a node that is inserted into the priority queue.
         for (int i = 0; i < adjacencyMatrix.length; i++) {            
            int degreeCount = 0;            
            for (int j = 0; j < adjacencyMatrix.length; j++) {                
                if (adjacencyMatrix[i][j]) {                    
                    degreeCount++;                }            
                }            
                
                pq.insert(i, degreeCount, 0);            
                degreeVertex[i] = degreeCount;           
                saturColor.add(new HashSet<Integer>());       
             }

             while (!pq.isEmpty()) {  
                //Take the node with the highest priority off of the queue. The node with the highest 
                //priority is a vertex that has the highest saturation degree or the highest number of 
                //adjacencies. Though it could be any vertex among the ones that share the highest saturation
                //degree and number of edges.        
                PriorNode node = pq.removeMax();    
                
                //If the node is empty then there is nothing to do and the program gets out of the loop
                if(node == null) {                
                    break;            
                }            
                
                //For that node, get what vertex it is
                int nodeData = node.data;            
                
                //Check to see if that node has been colored in already, if so then get the next node
                //of the highest priority. If there is no node, then get out of the loop.
                if (finalColor[nodeData] != 0) {               
                    node =pq.removeMax();                      
                    if(node != null) {                    
                        nodeData = node.data;                
                    }            
                }            
                
                //Find which color to color the node with if it is uncolored. If the potential color for this vertex is not the same
                //as the color of the vertices adjacent to it, then color the vertex that color.
                int currColor =0;                
                while (finalColor[nodeData] == 0) {                    
                    currColor++;                    
                    if (!saturColor.get(nodeData).contains(currColor)) {                        
                        finalColor[nodeData] = currColor;                    
                    }                
                }                    
                
                //Once the color is found for that vertex, update the saturation degree of the uncolored vertices adjacent to the newly
                //colored node. For each of the vertices, put the updated saturation degree in a new node that is added to the 
                //priority queue. 
                for (int j = 0; j < adjacencyMatrix.length; j++) {                        
                    if (adjacencyMatrix[nodeData][j] && finalColor[j] == 0 && !saturColor.get(j).contains(currColor)) {                            
                        saturColor.get(j).add(currColor);                            
                        pq.insert(j, degreeVertex[j], saturColor.get(j).size());                       
                    }                   
                }            
            }       
            
      
            //Return the colors used for the vertices.
            return finalColor;    
        }
    }
                    
    //Need a class that specifically handles the characteristics of a priority queue node of this algorithm,
    //which include ths vertex's number, the number of adjacencies -- or degrees -- a vertex has, and the 
    //amount of diverse colorings adjacenies the vertex has.
    class PriorNode{    
        public int data;    
        public int degree;    
        public int saturation;    
                        
        PriorNode(int d, int deg, int sat) {        
            data = d;        
            degree = deg;        
            saturation = sat;    
        }
    }
    
    //Need to create a specified priority queue class tha can uphold the dSatur algorithm principles:
    //meaning that the priority queue has to always make sure that whenever a node is added or removed
    //that the heap retains its rules. A node is moved up in the prioritiy queue of its parent has less saturation
    //then it, or if the parent and child have the same saturation but the parent has less degrees than it, then the parent
    //is moved down.
    class PriorQueue { 
        //Keep track of the nodes in the priority queue   
        private ArrayList<PriorNode> pq;  
        
        //Keeps track of where the end of priority queue really is
        int tail = 0;    
        
        //Initialize the size of the priority queue at the time of instantiation
        public PriorQueue(int size) {
            pq = new ArrayList<>(size);
        }
        
        public void insert(int dat, int deg, int sat) { 
            //Create a new node and add it at the end of the queue 
            PriorNode node = new PriorNode(dat, deg, sat);
            pq.add(tail,node);

            //Starting at the end of the heap/priority queue, make sure that the newly
            //inputted node doesn't violate the max heap property by comparing it to
            //its parent node. 
            int i = tail;
            int parent = (i - 1) / 2;
            
            //As long as the child is at a position greater than 0, and the parent of the child has less saturation than
            //the child, or if the parent has less degrees than the child, move the parent down to the child's current
            //position if the parent has less saturation than the child, or if the child and parent have the same saturation,
            //then move the parent down if the child has more degrees than the parent. If the child and parent have the 
            //same saturation and same degrees, then get of the loop. This continues until the right place for the node is 
            //found. Once the right place is found the node is set there. 
            while (i > 0 && (pq.get(parent).saturation < sat || pq.get(parent).degree < deg)) { 
                if (pq.get(parent).saturation < sat) { 
                    pq.set(i, pq.get(parent));
                    i = parent;
                    parent = (i - 1) / 2;
                } else if (pq.get(parent).saturation == sat) { 
                    if (pq.get(parent).degree < deg) {
                        PriorNode temp = pq.get(i);
                        pq.set(i, new PriorNode(pq.get(parent).data, pq.get(parent).degree,pq.get(parent).saturation ));
                        pq.set(parent, temp);
                        i = parent;
                        parent = (i - 1) / 2;
                    } else if (pq.get(parent).degree == deg) {
                        break;
                    }
                }
                pq.set(i, node);
            }
            //Increment tail to reflect that a new node as been added.
            tail++;
        }
        
        public PriorNode removeMax() {
            //Check to make sure that the queue is empty, if its return null
            if (tail == 0) {  
                return null; 
            } 
            
            //Decrement tail to get the end position of the priority queue. And then
            //swap the maximum priority node with the end node
            tail--;
            PriorNode maxNode = pq.get(0);
            PriorNode node = pq.get(tail); 
            pq.set(0, node); 
            
            //Now have to make sure that the node in position 0 doesn't violate the 
            //rules of the priority queue max heap. 
            int i = 0;
            PriorNode parentNode = pq.get(i); 
            int child = 2 * i + 1;  
            
            //Need to check which of the parentNode's children has the biggest priority. The parentNode's children can never
            //be where the maxNode was placed because the maxNode is "deleted". So by not taking into account maxNode's spot in the
            //priority queue, the maxNode is "deleted" from the queue. The child of the parentNode
            //that has the biggest priority is picked.
            while (child < tail) { 
                if (pq.get(child).saturation < pq.get(child + 1).saturation) { 
                    child++;
                } else if (pq.get(child).saturation == pq.get(child + 1).saturation) { 
                    if (pq.get(child).degree < pq.get(child + 1).degree) { 
                        child++;
                    } else if (pq.get(child).degree == pq.get(child + 1).degree) {
                        int vertex = new Random().nextBoolean() ? 0 : 1;
                        child += vertex; 
                    }
                }
                
                //Compare the child with the parent. If the child has more
                //saturation then the child moves up in the priority queue, and the
                //parent moves down to the child's previous spot. If the child
                //and the parent have the same saturation, then check to see if 
                //the chid has more degrees than the parent. If so, then the child
                //swaps moves up, and the parent moves down to child's former spot.
                //This keeps going until the rightful position of the parent is found.
                //Once it is, then we set the parentNode in that spot.
                if (pq.get(child).saturation > pq.get(i).saturation) {
                    PriorNode temp = pq.get(child); 
                    pq.set(i, temp);               
                    i = child;           
                    child = 2 * i + 1;          
                } else if (pq.get(child).saturation == pq.get(i).saturation) { 
                    if (pq.get(child).degree > pq.get(i).degree) { 
                        PriorNode temp = pq.get(child); 
                        pq.set(i, temp);                  
                        i = child; 
                        child = 2 * i + 1;            
                    } else{
                        break;
                    }
                } else { 
                    break; 
                }
            }
            pq.set(i, parentNode);

            //Return the node that was deleted from the priority queue.
            return maxNode;
        }  
        
        public boolean isEmpty() { 
            //Check if the priority queue is empty
            return pq.size() == 0;
        } 
        
        public static void main(String[] args) { 
            /*User inputs how many vertices the graph they want to create has and 
            the adjacencies each of the vertices have. Example graphs are down below*/
            
            //Read input from user for the number of vertices
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the number of vertices in the graph:");
            int numVertices = sc.nextInt();
            
            //Initializing the adjacency matrix
            boolean [] [] adjacencyMatrix = new boolean[numVertices][numVertices];
            
            //Getting user input for the graph's adjacencies
            for (int i=0; i<numVertices; i++){
                for (int j =0; j<numVertices; j++){
                    //Never ask about adjacencies between a vertex and itself
                    if (i!=j){
                        System.out.print("Does the vertex " +i +" have an adjacency with vertex " +j+ "? ");
                        System.out.println("Type \"0\" for yes and \"1\" for no.");
                        
                        int num = sc.nextInt();
                        while(num >1 || num <0){
                            System.out.print("Please enter \"0\" for yes and \"1\" for no only. ");
                            System.out.println("Does the vertex " +i +" have an adjacency with vertex " +j+ "?");
                            num = sc.nextInt();
                        }
                        
                        if (num == 0){
                            adjacencyMatrix[i][j]=true;
                        }
                    }
                }
            }
             sc.close();

             dSatur_Algorithm algor = new dSatur_Algorithm(adjacencyMatrix);
             
             //Perform the dSatur algorithm and print out each of the vertices' assigned color
             int [] color = algor.dSatur();
             for(int i =0; i<color.length; i++){
                System.out.println("Vertex " +i+"'s color is " +color[i]);
            }


        
        //Graph 1
        // boolean[][] adjacencyMatrix = new boolean[7][7];        
        // adjacencyMatrix[0][3] = true;        
        // adjacencyMatrix[3][0] = true;        
        // adjacencyMatrix[0][4] = true;        
        // adjacencyMatrix[4][0] = true;        
        // adjacencyMatrix[0][5] = true;        
        // adjacencyMatrix[5][0] = true;
        // adjacencyMatrix[1][3] = true;        
        // adjacencyMatrix[3][1] = true;        
        // adjacencyMatrix[1][6] = true;        
        // adjacencyMatrix[6][1] = true;         
        // adjacencyMatrix[1][2] = true;      
        // adjacencyMatrix[2][1] = true;        
        // adjacencyMatrix[2][1] = true;        
        // adjacencyMatrix[2][4] = true;        
        // adjacencyMatrix[4][2] = true;        
        // adjacencyMatrix[2][6] = true;        
        // adjacencyMatrix[6][2] = true;        
        // adjacencyMatrix[3][5] = true;        
        // adjacencyMatrix[5][3] = true;       
        // adjacencyMatrix[5][4] = true;        
        // adjacencyMatrix[4][5] = true;        
        // adjacencyMatrix[5][6] = true;        
        // adjacencyMatrix[6][5] = true;  
        
        //Graph 2
        // boolean[][] adjacencyMatrix = new boolean[5][5]; 
        // adjacencyMatrix[0][1] = true; 
        // adjacencyMatrix[0][2] = true; 
        // adjacencyMatrix[1][0] = true; 
        // adjacencyMatrix[1][2] = true; 
        // adjacencyMatrix[1][3] = true; 
        // adjacencyMatrix[2][0] = true; 
        // adjacencyMatrix[2][1] = true; 
        // adjacencyMatrix[2][3] = true; 
        // adjacencyMatrix[3][1] = true; 
        // adjacencyMatrix[3][2] = true; 
        // adjacencyMatrix[3][4] = true; 
        // adjacencyMatrix[4][3] = true; 

        //Graph 3
        // boolean[][] adjacencyMatrix = new boolean[5][5]; 
        // adjacencyMatrix[0][1] = true; 
        // adjacencyMatrix[0][2] = true; 
        // adjacencyMatrix[1][0] = true; 
        // adjacencyMatrix[1][2] = true; 
        // adjacencyMatrix[1][4] = true; 
        // adjacencyMatrix[2][0] = true;
        // adjacencyMatrix[2][1] = true;  
        // adjacencyMatrix[2][4] = true; 
        // adjacencyMatrix[3][4] = true; 
        // adjacencyMatrix[4][1] = true; 
        // adjacencyMatrix[4][2] = true; 
        // adjacencyMatrix[4][3] = true; 
    }
}
                                                                    
                                                                        