// Title: Product of the Last K Numbers
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/product-of-the-last-k-numbers/

            this.prefixProduct.add(this.prefixProduct.get(size) * num);
            this.size++;
        } else {
            this.size = 0;
            this.prefixProduct.add(1);
            this.prefixProduct = new ArrayList<Integer>();
        if (num == 0) {
    public void add(int num) {

    }
        this.size = 0;
        this.prefixProduct.add(1);
    public ProductOfNumbers() {

    private int size = 0;
    private ArrayList<Integer> prefixProduct = new ArrayList<>();
class ProductOfNumbers {
        }
    }

