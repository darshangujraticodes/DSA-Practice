## Java File Command

1. Note Java File Start with capital Letter and .java extension
2. Run Java file with

   1. javac Hello.java (java compiler convert .java code in machine language using java compiler which create .class file)
   2. java Hello (executing class file)

   or 3. java Hello.java (direct run)

### Time Complexity

Time Complexity is of three types

1. Big O - This represents the worst-case performance for an algorithm
2. Big Theta (Θ) - This represents the average case performance for an algorithm.
3. Big Omega (Ω) - This represents the best case performance for an algorithm

- Big O is always recommended becoz it test the code through worst scenario perpective
- It is used to describe the performance of an application.
- It help to define how my code will perform as the input grows.
- It help to build scalable web application with more optimized format to maintain software Efficiency and sclability.

1. Big O(1)
   When the code has single operation and take constant of time to execute data has Big O(1) time complexity.
2. Big O(n)
   When the code run single operation n time inside loop has Big O(n) time complexity.
3. Big O(n^2)
   When the code run single operation n time in nested loop has Big O(n^2) time complexity.
4. Big O(log n)
   One of the most optimsed way so algorithm with log is more efficient and scalable.
5. Big O(2^n)
   It is the opposite of (log n), it performance starts to degrade with increase in input, it never recommended always need to be avoid.

### Arrays

1. Array is a list of elements of same type which is place in contagious memory location.
2. Memory 1 byte : integer has 4 byte memeory size. and character has 1 byte memory storage.

Java array syntax :

```
int marks[] = new int[50];

int marks = {1,2,3,4,5,6,7,8,9};

```

#### Pros and Cons

✔️ Static arrays have a fixed size <br>
✔️ Dyanmic arrays grow by 50-100% <br>

❌ More Memory Usage – Requires extra memory for pointers. <br>
❌ Slower Access – Cannot access elements directly (like an array); must traverse from the head. <br>

### Linkedlist

1. It is a linear data structure in which elements are stored in memory as separate objects and connected using pointer
2. It has 2 values data: main content and address : memory address of next node
3. It has 3 types: single, double and circular

#### Pros and Cons

✔️ Dynamic Size <br>
✔️ Efficient Insertions/Deletions <br>

❌ More Memory Usage – Requires extra memory for pointers. <br>
❌ Slower Access – Cannot access elements directly (like an array); must traverse from the head. <br>

| Operation     | Arrays | LinkedList |
| :------------ | :----: | :--------: |
| By Index      |  O(1)  |    O(n)    |
| by Value      |  O(n)  |    O(n)    |
| insert start  |  O(n)  |    O(1)    |
| insert end    |  O(1)  |    O(1)    |
| insert Middle |  O(n)  |    O(n)    |
| delete start  |  O(n)  |    O(1)    |
| delete end    |  O(1)  |    O(n)    |
| delete middle |  O(n)  |    O(n)    |
