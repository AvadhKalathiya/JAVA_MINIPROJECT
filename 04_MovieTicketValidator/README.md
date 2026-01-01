# 🎬 Mini-Project: Movie Ticket Price Validator

---

### 🎯 Objective
Take user input:
- **Movie name** (`String` literal concept)
- **Age** (`int`)
- **Show time slot choice** (`int` → mapped to time ranges)

Then:
1. **Validate age** using `if-else`, relational (`>=`, `<`), and logical (`&&`, `!`) operators.
2. **Assign ticket price** based on time slot using `switch-case`.
3. **Apply Senior Citizen Discount** using logical operators when age ≥ 60.

---

### 🧠 Concepts Used
- **String literals** (movie name input)
- **Relational operators:** `>=`, `<`
- **Logical operators:** `&&`, `!`
- **Boolean negation:** `!(age >= 18)`
- **Control flow:** `if-else` and `switch-case`

---

### 📌 Ticket Pricing Rules
| Time Slot Choice | Show Time Range | Price |
|-----------------|----------------|-------|
| `1` | 9 AM – 12 PM | ₹150 |
| `2` | 1 PM – 4 PM | ₹200 |
| `3` | 5 PM – 8 PM | ₹250 |
| `4` | 9 PM – 12 AM | ₹300 |

---

### 🎟️ Discount Rule
| Condition | Discount |
|----------|----------|
| Age ≥ 60 (Senior Citizen) | **20% OFF** on ticket price |

---

### 🧾 Sample Outputs

#### ✅ Adult Case

Enter Movie: Inception
Enter Age: 22
Select Time Slot: 3

--- Ticket Report ---
Category : Adult
Base Price : ₹250
Discount Applied : No
Final Price : ₹250


#### 👶 Child Case


Enter Movie: Frozen
Enter Age: 10
Select Time Slot: 1

--- Ticket Report ---
Category : Child
Base Price : ₹150
Discount Applied : No
Final Price : ₹150


#### 👴 Senior Citizen Case


Enter Movie: Interstellar
Enter Age: 65
Select Time Slot: 2

--- Ticket Report ---
Category : Senior Citizen
Base Price : ₹200
Discount Applied : 20%
Final Price : ₹160


---

### 🧠 Placement + Viva Talking Points
- `if-else` used for **age validation & category flow**
- `>=`, `<` used for **relational checks**
- `&&`, `!` used for **logical decision making**
- `switch-case` used for **multi-option pricing**
- `!(age >= 18)` demonstrates **boolean negation**
- **One-pass validation mindset → scalable design**

---

### ⏱️ Complexity
- **Time Complexity:** `O(1)` for decision logic + `O(n)` if scanning password/movie list etc. (not required here)
- **Space Complexity:** `O(1)` → uses only variables

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement-Focused Mini Projects