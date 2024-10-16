#include <vector>
using namespace std;

class Solution {
public:
    int trap(vector<int>& height) {
        
        int leftMax = height[0];

        int rightMax = height[height.size() - 1];

        int l = 0;
        int r = height.size() - 1;

        int res = 0;
        while(l < r){

            if (leftMax < rightMax) {
                l++;

                leftMax = max(leftMax, height[l]);

                res += leftMax - height[l];
            }
            else{

                r--;
                
                rightMax = max(rightMax, height[r]);

                res += rightMax - height[r];

            }
        }

        return res;
    }
};

//Time Complexity: O(n)
//Space Complexity: O(1)
