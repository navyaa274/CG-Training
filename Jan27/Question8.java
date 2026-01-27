package Jan27;

import java.util.Scanner;

class TextState {
    String content; TextState next, prev;
    TextState(String content) { this.content = content; }
}

public class Question8 {
    static TextState head, tail, current; static final int MAX_STATES = 10;

    static void addState(String content) {
        TextState newState = new TextState(content);
        if (head == null) { head = tail = current = newState; return; }

        // Limit history
        if (getSize() >= MAX_STATES) {
            head = head.next; head.prev = null;
        }

        tail.next = newState; newState.prev = tail; tail = newState;
        current = newState;
    }

    static void undo() {
        if (current != null && current.prev != null) current = current.prev;
    }

    static void redo() {
        if (current != null && current.next != null) current = current.next;
    }

    static int getSize() {
        int size = 0; TextState temp = head;
        while (temp != null) { size++; temp = temp.next; }
        return size;
    }

    static void displayCurrent() {
        if (current != null) {
            System.out.println("Current: " + current.content + " [History: " + getSize() + "]");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int choice;
        addState(""); // Initial empty state
        do {
            System.out.println("\n1.Type 2.Undo 3.Redo 4.Display 0.Exit");
            choice = sc.nextInt(); sc.nextLine();
            switch(choice) {
                case 1: System.out.print("Text:"); String text = sc.nextLine();
                    addState(text); break;
                case 2: undo(); displayCurrent(); break;
                case 3: redo(); displayCurrent(); break;
                case 4: displayCurrent(); break;
            }
        } while(choice!=0); sc.close();
    }
}