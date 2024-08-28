public class TestMain {
    public static void main(String[] args) {
        Main mainObj = new Main();
        Main.MemberClass memberObj = mainObj.new MemberClass();
        memberObj.print();
    }
}