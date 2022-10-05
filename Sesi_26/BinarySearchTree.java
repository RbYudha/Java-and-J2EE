package Sesi_26;

import java.util.Scanner;

public class BinarySearchTree {
    // static menjadikan class member bukan object.
    // static Scanner in = new Scanner(System.in);
    Scanner in = new Scanner(System.in);

    // kelas node
    static class node {
        node left, right;
        int value;

        public void input(int a) {
            value = a;
        }
    }

    public void insert(node a, int b) {
        // cek apakah b lebih kecil dari nilai a
        if (b < a.value) {
            if (a.left != null) {
                insert(a.left, b);
            } else {
                a.left = new node();
                a.left.input(b);
                System.out.println(b + " di kiri " + a.value);
            }
            // cek apakah b lebih besar dari nilai a
        } else if (b > a.value) {
            if (a.right != null) {
                insert(a.right, b);
            } else {
                a.right = new node();
                a.right.input(b);
                System.out.println(b + " di kanan " + a.value);
            }
        }
    }

    public void preOrder(node a) {
        if (a != null) {
            System.out.print(a.value + " ");
            // fungsi yang memanggil diri sendiri
            preOrder(a.left);
            preOrder(a.right);
        }
    }

    // public void postOrder(node a) {
    // if (a != null) {
    // System.out.print(a.value + " ");
    // // fungsi yang memanggil diri sendiri
    // postOrder(a.right);
    // postOrder(a.left);
    // }
    // }

    public void view(node a) {
        System.out.print("Pre Order : ");
        preOrder(a);
        System.out.println(" ");

        // System.out.print("Post Order : ");
        // postOrder(a);
        // System.out.println(" ");
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        node root = new node();

        int menu = 1;
        int r = 1;
        int a;

        while (menu != 3) {
            System.out.println("--System pencarian menngunakan binary tree--");
            System.out.println("Menu : ");
            System.out.println("1. Input \n2. View \n3. Exit");
            System.out.print("Masukan disini : ");
            menu = tree.in.nextInt();
            if (menu == 1) {
                System.out.print("Masukan Angka : ");
                a = tree.in.nextInt();
                if (r == 1) {
                    root.input(a);
                    r--;
                } else {
                    tree.insert(root, a);
                }
            } else if (menu == 2) {
                tree.view(root);
            } else if (menu == 3) {
                System.out.println("Keluar");
            } else {
                System.out.println("Error");
            }
            System.out.println();
        }

    }

}
