;; You are climbing a staircase. It takes n steps to reach the top.
;; Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
;;
;; Example 1:
;; Input: n = 2
;; Output: 2
;; Explanation: There are two ways to climb to the top.
;; 1. 1 step + 1 step
;; 2. 2 steps
;;
;; Example 2:
;; Input: n = 3
;; Output: 3
;; Explanation: There are three ways to climb to the top.
;; 1. 1 step + 1 step + 1 step
;; 2. 1 step + 2 steps
;; 3. 2 steps + 1 step

(defun climb-stairs (n)
  "Return the number of distinct ways to climb to the top of a staircase with N steps."
  (if (<= n 0)
      0
    (let ((dp (make-vector (1+ n) 0)))
      (aset dp 0 1)  ;; Base case: 1 way to stay at the ground (0 steps)
      (aset dp 1 1)  ;; Base case: 1 way to climb 1 step
      (dotimes (i (- n 1))  ;; Fill the dp array for steps 2 to n
        (aset dp (1+ i) (+ (aref dp i) (aref dp (1+ i)))))
      (aref dp n))))  ;; Return the number of ways to climb n steps

;; Example usage:
(climb-stairs 2)  ;; => 2
(climb-stairs 3)  ;; => 3
