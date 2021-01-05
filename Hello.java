public class Hello {
    public static void main(String...args){
        final int PAGE_AREA_TYPE6_BE3 = 23;
        final int FIX_ROW_TYPE6_BE3 = 1;

        // recordNum = 21
        int recordNum = 23 + 21;
        System.out.println("recordNum = 21");
        System.out.println(chohyoPageCnt(recordNum,PAGE_AREA_TYPE6_BE3, FIX_ROW_TYPE6_BE3));
        // recordNum = 22
        recordNum = 23 + 22;
        System.out.println("recordNum = 22");
        System.out.println(chohyoPageCnt(recordNum,PAGE_AREA_TYPE6_BE3, FIX_ROW_TYPE6_BE3));
        // recordNum = 23
        recordNum = 23 + 23;
        System.out.println("recordNum = 23");
        System.out.println(chohyoPageCnt(recordNum,PAGE_AREA_TYPE6_BE3, FIX_ROW_TYPE6_BE3));
    }
    public static int chohyoPageCnt(int recordNum, int pageArea, int fixRow) {
        if (recordNum <= pageArea - fixRow) {
            return 1;
        } else if (pageArea - (recordNum % pageArea) >= fixRow) {
            return (recordNum / pageArea) + 1;
        } else {
            return (recordNum / pageArea) + 2;
        }
    }
}
