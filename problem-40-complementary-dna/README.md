```md
# Complementary DNA

### Question:
Given a string representing a DNA sequence, return its complementary strand according to the standard base pairing rules in DNA. Each nucleotide in the input string has a specific complementary base that forms the other half of the DNA strand.

### Rules:
1. DNA is made up of four bases: **A**, **C**, **G**, and **T**.  
2. Each base pairs with its complement as follows:  
   - **A** pairs with **T**  
   - **T** pairs with **A**  
   - **C** pairs with **G**  
   - **G** pairs with **C**  
3. The function should return a string where each base in the input is replaced by its complementary base in the same order.

### Test Cases:
| **Sr. No.** | **Function Call**                          | **Expected Output**      |
| ----------- | ------------------------------------------ | ------------------------ |
| 1           | `complementaryDNA("ACGT")`                 | `"TGCA"`                 |
| 2           | `complementaryDNA("ATGCGTACGTTAGC")`       | `"TACGCATGCAATCG"`       |
| 3           | `complementaryDNA("GGCTTACGATCGAAG")`      | `"CCGAATGCTAGCTTC"`      |
| 4           | `complementaryDNA("GATCTAGCTAGGCTAGCTAG")` | `"CTAGATCGATCCGATCGATC"` |
