# 🏨 Mini-Project: Hostel Room & Student Allocation Map

A placement-focused project to build confidence in **array modeling, traversal, analytics, and in-place updates** using real-world constraints.

---

## 🎯 Real-World Scenario
Simulate a hostel floor where:
- Each **room stores student IDs**
- A **2D array models floor layout** (`rooms × beds`)
- You perform **analytics using loops**
- `for-each` loop prints allocations cleanly
- Input is validated using **relational & logical expressions**
- Pricing/choices can extend using **switch-case if needed**

---

## 🧠 Concepts Used
- ✔ **Introduction to Arrays**
- ✔ Array operations: **create, access, update, search, sum, max/min**
- ✔ **for-each loop** for clean iteration
- ✔ **Multidimensional (2D) arrays**
- ✔ In-place updates (`floor[r][b] = newID`)
- ✔ Search domination mindset (`O(n)` scan for analytics)
- ✔ Counter tracking for occupied & empty beds

---

## 🛏 Hostel Menu Model (2D Floor → Rooms × Beds)
| Room (Row Index) | Beds (Columns) |
|----------------|----------------|
| 1 | 101, 102, 0 |
| 2 | 103, 0, 0 |
| 3 | 104, 105, 106 |

> `0` represents an empty bed.

---

## 📊 Supported Operations & Complexity
| Operation | Time | Space |
|----------|------|-------|
| Access a bed (`arr[i]`) | `O(1)` | `O(1)` |
| Search max/min on floor | `O(n)` | `O(1)` |
| Update allocation (in-place) | `O(1)` | `O(1)` |
| Full floor traversal | `O(n)` | `O(1)` |

---

## 🧾 Sample Output

🛏 current hostel allocation (room → beds):
room 1: 101 102 0
room 2: 103 0 0
room 3: 104 105 106

📊 hostel analytics:
total students allocated : 6
total empty beds : 3
highest student id : 106
lowest student id : 101

enter room number to allocate new student (1-3): 2
enter bed number (1-3): 1
enter student id: 107

✅ allocation successful!

🧾 updated hostel allocation:
room 1: 101 102 0
room 2: 103 107 0
room 3: 104 105 106


---

## 🧠 Placement-Worthiness
This project proves:
- **Array = real memory modeling (contiguous storage mindset)**
- **2D array = real-world grid/floor mapping**
- **for-each = clean iteration in code reviews and interviews**
- **Search = `max/min` detection via 1-pass scan**
- **Update = in-place overwrite, no extra memory**
- **Counters = occupancy & empty bed analytics**
- **Scalable thinking = always target `O(n)` scan instead of `O(n²)` when avoidable**

---

## 🔥 Interview-Ready One-Liner
> *“I modeled hostel allocation using a 2D in-place array, accessed beds in O(1), scanned once for analytics in O(n), and updated allocations directly without extra space, keeping auxiliary memory O(1).”*

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Prep Notes & Real-World Mini Projects