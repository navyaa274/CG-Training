package Jan27;

import java.util.Scanner;

class User {
    int userId; String name; int age; int[] friends; int friendCount; User next;
    User(int userId, String name, int age) {
        this.userId = userId; this.name = name; this.age = age; this.friendCount = 0;
        this.friends = new int[10]; // Max 10 friends
    }
}

public class Question7 {
    static User head;

    static void addUser(int id, String name, int age) {
        User node = new User(id, name, age);
        node.next = head; head = node;
    }

    static void addFriend(int userId, int friendId) {
        User user = findUser(userId);
        if (user != null && user.friendCount < 10) {
            user.friends[user.friendCount++] = friendId;
        }
    }

    static User findUser(int id) {
        User temp = head; while (temp != null) {
            if (temp.userId == id) return temp; temp = temp.next;
        } return null;
    }

    static void displayFriends(int id) {
        User user = findUser(id);
        if (user != null) {
            System.out.println(user.name + " friends (" + user.friendCount + "):");
            for (int i = 0; i < user.friendCount; i++) {
                System.out.print(user.friends[i] + " ");
            }
            System.out.println();
        }
    }

    static void mutualFriends(int id1, int id2) {
        User u1 = findUser(id1), u2 = findUser(id2);
        if (u1 == null || u2 == null) return;
        System.out.print("Mutual friends: ");
        for (int i = 0; i < u1.friendCount; i++) {
            for (int j = 0; j < u2.friendCount; j++) {
                if (u1.friends[i] == u2.friends[j]) {
                    System.out.print(u1.friends[i] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int choice;
        do {
            System.out.println("\n1.AddUser 2.AddFriend 3.DisplayFriends 4.MutualFriends 0.Exit");
            choice = sc.nextInt(); sc.nextLine();
            switch(choice) {
                case 1: System.out.print("ID:"); int uid=sc.nextInt();
                    sc.nextLine(); System.out.print("Name:"); String n=sc.nextLine();
                    System.out.print("Age:"); int a=sc.nextInt(); sc.nextLine();
                    addUser(uid,n,a); break;
                case 2: System.out.print("UserID:"); int u=sc.nextInt();
                    System.out.print("FriendID:"); addFriend(u,sc.nextInt()); sc.nextLine(); break;
                case 3: System.out.print("UserID:"); displayFriends(sc.nextInt()); break;
                case 4: System.out.print("User1 ID:"); int id1=sc.nextInt();
                    System.out.print("User2 ID:"); mutualFriends(id1,sc.nextInt()); sc.nextLine(); break;
            }
        } while(choice!=0); sc.close();
    }
}