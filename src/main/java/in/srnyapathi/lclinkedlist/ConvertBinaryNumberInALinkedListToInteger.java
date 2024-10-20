package in.srnyapathi.lclinkedlist;

public class ConvertBinaryNumberInALinkedListToInteger {

    public int getDecimalValue(ListNode head) {

        int result = 0;

        while(head!=null){
            result = result *2 ;
            result = result + head.val;
            head=head.next;
        }

        return result;

    }
}
