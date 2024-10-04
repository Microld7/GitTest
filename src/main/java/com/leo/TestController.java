package com.leo;

import java.io.Serializable;

/**
 * GitTest com.leo
 * 2024/10/3 19:20
 * @Author LD
 */
public class TestController implements Serializable {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

