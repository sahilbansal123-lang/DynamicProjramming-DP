public class Introductiion {
    public static void main(String[] args) {
        System.out.println("Dynamic Programming is mainly an optimization over plain recursion. Wherever we see a recursive solution \n" +
                "that has repeated calls for same inputs, we can optimize it using Dynamic Programming. The idea is to simply store \n" +
                "the results of sub problems, so that we do not have to re-compute them when needed later. This simple optimization\n" +
                "reduces time complexities from exponential to polynomial.");

        System.out.println();
        System.out.println("The following are the steps that the dynamic programming follows:\n" +
                "\n" +
                "1. It breaks down the complex problem into simpler subproblems.\n" +
                "2. It finds the optimal solution to these sub-problems.\n" +
                "3. It stores the results of subproblems (memoization). The process of storing the results of subproblems is known as memorization.\n" +
                "4. It reuses them so that same sub-problem is calculated more than once.\n" +
                "5. Finally, calculate the result of the complex problem.");
    }
}