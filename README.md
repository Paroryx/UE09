# Software Development Exercises - UE09  

## 📜 Tasks  
This exercise focuses on implementing and managing dynamically linked data structures in Java. The primary objective is to create a sorted, singly linked list for `Task` objects, supporting various operations like adding, clearing, converting to an array, and extracting sublists.  

### 1. **TaskListNode**  
Implement a node class (`TaskListNode`) to store `Task` objects and a reference to the next node.  

---

### 2. **TaskList**  
Develop a `TaskList` class that uses `TaskListNode` objects and supports the following operations:  

- **Add Tasks:**  
  - Method: `void addSorted(Task task)`  
  - Adds a `Task` to the list in descending order of duration.  

- **Clear List:**  
  - Method: `int clear()`  
  - Removes all tasks from the list and returns the count of removed tasks.  

- **Convert to Array:**  
  - Method: `Task[] asArray()`  
  - Converts the list into an array representation.  

- **Extract Sublist:**  
  - Method: `TaskList getTaskListWithin(int minDuration, int maxDuration)`  
  - Extracts and returns a new list of tasks within the specified duration range.  

- **Find Shortest Task:**  
  - Method: `Task getShortestTask()`  
  - Returns the task with the shortest duration.  

- **Find Longest Task:**  
  - Method: `Task getLongestTask()`  
  - Returns the task with the longest duration.  

- **Remove Tasks by Duration:**  
  - Method: `int remove(int duration)`  
  - Removes all tasks matching the specified duration and returns the count.  

- **ToString Representation:**  
  - Method: `String toString()`  
  - Returns a string representation of the list, with each task on a new line.  

- **Static Factory Method:**  
  - Method: `static TaskList from(Task... tasks)`  
  - Creates and populates a new `TaskList` using the provided tasks.  

---

### 3. **TaskListApplication**  
Develop a `TaskListApplication` class with a `main` method to test all functionalities of the `TaskList` class.  

---

## 📂 Project Structure  

``src/``

- ``In.java`` Helper class for input  
- ``Out.java`` Helper class for output  
- ``Task.java`` Represents a task with a name and duration  
- ``TaskListNode.java`` Node class for the singly linked list  
- ``TaskList.java`` Implementation of the sorted linked list and its operations  
- ``TaskListApplication.java`` Entry point for testing the list implementation  

``tests/``

- ``Testprotokoll.txt`` Test cases and results for all tasks  

---

## 🛠 Tools  
- **Programming Language:** Java  
- **Editor:** Visual Studio Code with [JavaWiz](https://github.com/SSW-JKU/javawiz) extension  

---

## 📝 License  
This project is licensed under the [MIT License](LICENSE).