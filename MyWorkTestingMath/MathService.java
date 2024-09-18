package com.datorium.Datorium.API;

public class MathService {
    public int sum(int a, int b) {
        int result = a + b;
        // If the result exceeds 100, return 0
        return result > 100 ? 0 : result;
    }
}
