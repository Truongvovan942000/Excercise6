/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author TRUONG
 */
public class testcase {
    public void test(){
        try {
            String a = "i want to to go the the zoo";
            System.out.println("Case a: input:" + a);
            System.out.println("Expect output: chin tram tam muoi bay nghin sau tram nam muoi bon");
            System.out.println("Real output:" + DuplicateWord.remove(a));
            System.out.println("\n");
           
            String b = "quang quang an con con heo";
            System.out.println("Case c: input:" + b);
            System.out.println("Expect output: REPEAT an REPEAT heo");
            System.out.println("Real output:" + DuplicateWord.remove(b));
            System.out.println("\n");

            String c = "hung hung dep troai troai";
            System.out.println("Case d: input:" + c);
            System.out.println("Expect output: REPEAT dep REPEAT");
            System.out.println("Real output:" + DuplicateWord.remove(c));
            System.out.println("\n");

            String d = "con con heo dang dang iu";
            System.out.println("Case e: input:" + d);
            System.out.println("Expect output: REPEAT heo REPEAT iu");
            System.out.println("Real output:" + DuplicateWord.remove(d));
            System.out.println("\n");
            
            String e = "con con ca dang iu iu ghe";
            System.out.println("Case e: input:" + e);
            System.out.println("Expect output: REPEAT ca dang REPEAT ghe");
            System.out.println("Real output:" + DuplicateWord.remove(e));
            
        } catch (Exception e) {
            
        }
    }

    
}
