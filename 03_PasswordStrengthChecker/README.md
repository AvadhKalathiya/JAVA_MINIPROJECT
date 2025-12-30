# 📝 Mini-Project: Password Strength Checker

### 🎯 Objective
Analyze a password string and classify it as:
- **Strong**
- **Medium**
- **Weak**

This project builds confidence in handling **String validation logic**, a common requirement in coding interviews.

---

### 🧠 Concepts Used
- String & String literal basics
- Key String methods:
  - `length()`
  - `matches()` (Regex literal expressions)
  - `contains()`
  - `toLowerCase()`
  - `charAt()`
  - `charAt()` for character extraction

---

### 📌 Strength Rules
| Condition | Strength |
|----------|----------|
| `length ≥ 8` **AND** contains a number + a special character | **Strong** |
| `length 5–7` | **Medium** |
| `length < 5` | **Weak** |

✔️ Special character check uses regex: `[^a-zA-Z0-9]`  
✔️ Number check uses regex: `[0-9]`

---

### 🧾 Sample Output
Enter Password: Avadh@2198

--- Password Report ---
Password : Avadh@2198
Length : 10
Has Number? : true
Has Special Char?: true
Lowercase sample : a
Strength : Strong


---

### ⏱️ Complexity
- **Time Complexity:** `O(n)` → scans the password once for validation
- **Space Complexity:** `O(1)` → uses only a few variables (no extra data structures)

---

### 💡 Placement Benefits
- Shows understanding of:
  - String **validation and immutability awareness**
  - Use of **regex literals** inside `matches()`
  - Character extraction using `charAt()`
  - Real-world **feasibility checks**
  - One-pass scalable logic (`O(n)` mindset)

---

### 🔥 Interview-Ready Explanation
> *“I treat the password as a sequence of characters, sample lowercase using `toLowerCase()`, check digits and special characters using regex literals, and classify based on length and content. The logic runs in `O(n)` time and `O(1)` space.”*

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement-Focused Mini-Projects
