/*
 * Copyright (c) 2012, NTT Multimedia Communications Laboratories, Inc. and Koushik Sen
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * 1. Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package tests;

import catg.CATG;

/**
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */
public class AbstractionTest1 {
    public static boolean testme(int x, int y){
        int z = foo(y);
        if(z==x){
            if(x>y+10){
                return true;
            }
        }
        return false;
    }

    private static int foo(int y) {
        return 2*y;
    }

    public static void main(String[] args){
        int x1 = CATG.readInt(1);
        int y1 = CATG.readInt(1);
        int x2 = CATG.readInt(1);
        int y2 = CATG.readInt(1);
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);

        CATG.BeginScope("test");
        boolean b1 = testme(x1, y1);
        CATG.EndScope("test");
        b1 = CATG.abstractBool("test", b1);

        CATG.BeginScope("test");
        boolean b2 = testme(x2, y2);
        CATG.EndScope("test");
        b2 = CATG.abstractBool("test", b2);

        System.out.println(b1);
        System.out.println(b2);

        if (b1 && b2) {
            System.out.println("Error");
        }
    }
}
