/* 
 * Copyright 2018 Victor Ballester Asensi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Scanner;

/**
 *
 * @author Victor Ballester Asensi
 */
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        int talla;
        try {
            System.out.print("Talla zapato ...: ");
            talla = scn.nextInt();
            System.out.printf("Talla zapato ...: %d%n", talla);
        } catch (Exception e) {
            System.out.println("ERROR Entrada Incorrecta");
        } finally{
            scn.nextLine();
        }
    }
}