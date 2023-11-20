public class TestRectangle
{
    public static void main(String[] args)
    {
        Rectangle rec = new Rectangle("Ruby", "Red", 6, 8);
        //In loai hinh chu nhat        
        System.out.println(rec.getType());
        //In thong tin
        System.out.println(rec);
        //SV tu kiem tra them cac phuong thuc khac
        System.out.println(rec.getPerimeter());
        
        System.out.println(rec.calDiagonalLine());
        System.out.println(rec.resize(0));
        }
}
