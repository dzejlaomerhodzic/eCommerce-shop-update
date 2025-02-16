# Online Shop - Version 2


## Overview
For the final assignment (Assignment 3), you will continue working on the same code from Assignment 2. This version introduces two important customer data points:

1. **Credit Balance**: Represents the amount ($) a customer has in the system, similar to a gift card.
2. **Favorite Category**: Represents the category from which a customer purchases the most items.

## New Reports & Adjustments

### 1. Product Recommendation Report
Recommend one product for each customer based on their available credit. The strategy is to offer the most expensive product they can afford using their credits. Feel free to add new products to the CSV file if necessary.

### 2. Top 10 Customers by Credit Balance (Multi-threaded)
Generate a report displaying the **Top 10 customers**, sorted by the highest credit balance. This report must be implemented using **threads** to improve performance.

### 3. Multi-threaded Conversion of Report #2 from Assignment 2
Modify the **Top Customers Report** from Assignment 2 to work with **threads**, ensuring efficient processing.

## Implementation Details
- Continue using **Java** as the primary programming language.
- Fetch and update customer data from the CSV file.
- Implement **multi-threading** for enhanced performance in reports.
- Ensure the existing **unit tests** cover the new features.

## How to Run
```sh
# Clone the repository
git clone https://github.com/your-username/eCommerce-shop-update.git
cd eCommerce-shop-update

# Compile and run the program
javac Main.java
java Main
```

## Future Enhancements
- Implement a **dynamic recommendation engine** based on customer preferences.
- Store and retrieve data using a **database** instead of CSV files.
- Introduce a **GUI interface** for a better user experience.


