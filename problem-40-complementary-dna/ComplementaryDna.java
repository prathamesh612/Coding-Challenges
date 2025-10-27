public class ComplementaryDna {

    public static void main(String[] args) {
        System.out.println(complementaryDNA("ACGT"));
        System.out.println(complementaryDNA("ATGCGTACGTTAGC"));
        System.out.println(complementaryDNA("GGCTTACGATCGAAG"));
        System.out.println(complementaryDNA("GATCTAGCTAGGCTAGCTAG"));
    }

    // Returns the complementary DNA strand for a given DNA sequence
    private static String complementaryDNA(String strand) {

        char[] strandArr = strand.toCharArray();
        StringBuilder result = new StringBuilder();

        // Replace each base with its complementary pair
        for (char c : strandArr) {
            switch (c) {
                case 'A':
                    result.append('T');
                    break;
                case 'T':
                    result.append('A');
                    break;
                case 'C':
                    result.append('G');
                    break;
                case 'G':
                    result.append('C');
                    break;
                default:
                    break; // ignore invalid characters (if any)
            }
        }

        return result.toString();
    }
}

/*
 * This method converts a DNA strand into its complementary sequence
 * using base-pairing rules (A↔T and C↔G). It loops through each
 * nucleotide and appends its match to a StringBuilder.
 *
 * Used: switch-case for base mapping and StringBuilder for efficient string creation.
 */