class method{
    public static int sumDigits(int n){
        int sum = 0;
        while (n > 0) {
            sum += n % 10;//หารเก็บเศษทีละตัวแล้วเอามาบวกค่าที่จะส่งออกไป
            n /= 10;//ลดจำนวนหลักด้วยการหาร10
        }
        return sum;
    }
}