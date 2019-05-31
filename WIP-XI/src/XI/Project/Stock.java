/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class Stock {
    public static void main(String[] args) {
        int item=1,limit=10,menu = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Print item, limit :1.Add 2.Remove 3.Check");
        System.out.print("Input menu: ");
        menu =sc.nextInt(); 
        System.out.println("Menu"+menu);
        if (menu==1) {
            if (item<limit){
                System.out.print("Input amount :");
                int amount =sc.nextInt();
                if (item+amount>limit){
                    System.out.println("ไอเท็มเกินลิมิต");
                }
                else{
                    item=item+amount;
                    System.out.printf("Item=%d Limit=%d \n",item,limit);
                }
            }
            else {
                System.out.println("ไอเท็มเต็มแล้ว");
            }
        }
        if (menu==2){
            if (item>0){
                System.out.print("Input amount :");
                int amount =sc.nextInt();
                if (item-amount<limit){
                    System.out.println("ไอเท็มมีไม่พอให้ลบ");
                }
                else{
                    item=item-amount;
                    System.out.printf("Item=%d Limit=%d \n",item,limit);
                }
            }
            else{
                System.out.println("ไม่มีไอเท็มในโกดัง");
            }
        }
        if (menu==3){
            System.out.printf("item= %d Limit=%d \n",item,limit);
        }
        else {
            System.out.println("เมนูไม่ถูกต้อง");
        }
    }
}
