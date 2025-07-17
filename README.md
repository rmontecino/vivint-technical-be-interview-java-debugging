# Exercise: Debug and Fix the Order Processing System

---

## Problem Statement

You have an `OrderProcessingService` that's intended to:

1. Add items to an order.
2. Calculate the total cost of items.
3. Apply a discount if the order meets certain conditions.
4. Complete the order and print a summary.

However, the system has several bugs that are causing incorrect order totals, discount miscalculations, and other issues. Your task is to debug and fix these issues so the `processOrder` method works as expected.

---

## Requirements

1. **Bug Fixes:** Identify and fix the bugs to ensure `processOrder` works correctly.
2. **Expected Behavior:**
    * Each Item added to the order should contribute to the total.
    * If there are 3 or more items, apply a 10% discount on the total.
    * Display the correct order total and discount percentage in the output.

---

## Project Structure

```
├── Models/
│   ├── Item.java
│   └── Order.java
├── Services/
│   └── OrderProcessingService.java
├── Main.java
└── README.md
```

## How to Run

1. Compile the Java files:
   ```bash
   javac -d . Models/*.java Services/*.java Main.java
   ```

2. Run the main class:
   ```bash
   java Main
   ```

---

## Expected Output (After Debugging)
```
Order Total: $157.5, Discount: 10%
```

---

## Evaluation Criteria
* **Correctness:** All bugs are correctly identified and fixed.
* **Output:** Output is formatted correctly, showing the total and discount percentage.
* **Understanding:** Solutions demonstrate understanding of how to properly update and display order information.
* **Java Best Practices:** Code follows Java naming conventions and uses appropriate data types (BigDecimal for monetary values).