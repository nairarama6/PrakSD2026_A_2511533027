package pekan5_2511533027;

public class TambahSLL_2511533027 {
  public static NodeSLL_2511533027 insertAtFront_3027(NodeSLL_2511533027 head_3027, int value_3027) {
    NodeSLL_2511533027 new_node = new NodeSLL_2511533027(value_3027);
    new_node.next_3027 = head_3027;
    return new_node;
  }

  // fungsi menambahkan node diakhir SLL
  public static NodeSLL_2511533027 insertAtEnd_3027(NodeSLL_2511533027 head_3027, int value_3027) {
    NodeSLL_2511533027 newNode_3027 = new NodeSLL_2511533027(value_3027);

    if (head_3027 == null) {
      return newNode_3027;
    }

    NodeSLL_2511533027 last = head_3027;

    while (last.next_3027 != null) {
      last = last.next_3027;
    }

    last.next_3027 = newNode_3027;
    return head_3027;
  }

  static NodeSLL_2511533027 GetNode_3027(int data_3027) {
    return new NodeSLL_2511533027(data_3027);
  }

  static NodeSLL_2511533027 insertPos_3027(NodeSLL_2511533027 headNode_3027, int position_3027, int value_3027) {
    NodeSLL_2511533027 head_3027 = headNode_3027;

    if (position_3027 < 1)
      System.out.print("invalid position");

    if (position_3027 == 1) {
      NodeSLL_2511533027 new_node = new NodeSLL_2511533027(value_3027);
      new_node.next_3027 = head_3027;
      return new_node;
    } else {
      while (position_3027-- != 0) {
        if (position_3027 == 1) {
          NodeSLL_2511533027 newNode_3027 = GetNode_3027(value_3027);
          newNode_3027.next_3027 = headNode_3027.next_3027;
          headNode_3027.next_3027 = newNode_3027;
          break;
        }
        headNode_3027 = headNode_3027.next_3027;
      }
      if (position_3027 != 1)
        System.out.print("Posisi di luar jangkauan");
    }
    return head_3027;
  }

  public static void printList_3027(NodeSLL_2511533027 head_3027) {
    NodeSLL_2511533027 curr = head_3027;
    while (curr.next_3027 != null) {
      System.out.print(curr.data_3027 + "-->");
      curr = curr.next_3027;
    }
    if (curr.next_3027 == null) {
      System.out.print(curr.data_3027);
      System.out.println();
    }
  }

  public static void main(String[] args) {
    NodeSLL_2511533027 head_3027 = new NodeSLL_2511533027(2);
    head_3027.next_3027 = new NodeSLL_2511533027(3);
    head_3027.next_3027.next_3027 = new NodeSLL_2511533027(5);
    head_3027.next_3027.next_3027.next_3027 = new NodeSLL_2511533027(6);

    System.out.print("Senarai berantai awal:");
    printList_3027(head_3027);

    System.out.print("tambah 1 simpul di depan: ");
    int data_3027 = 1;
    head_3027 = insertAtFront_3027(head_3027, data_3027);
    printList_3027(head_3027);

    System.out.print("tambah 1 simpul di belakang: ");
    int data2 = 7;
    head_3027 = insertAtEnd_3027(head_3027, data2);
    printList_3027(head_3027);

    System.out.print("tambah 1 simpul ke data 4: ");
    int data3 = 4;
    int pos = 4;
    head_3027 = insertPos_3027(head_3027, pos, data3);
    printList_3027(head_3027);
  }
}