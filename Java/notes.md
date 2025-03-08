## Java File Command

1. Note Java File Start with capital Letter and .java extension
2. Run Java file with

   1. javac Hello.java (java compiler convert .java code in machine language using java compiler which create .class file)
   2. java Hello (executing class file)

   or 3. java Hello.java (direct run)

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
