public class cache extends bloc {
    public static int k = 1024;
    public static int cs = 16*k;
    public static int bs = 32;
    public static int assoc = 4;
    public static int nbe = cs/(bs*assoc);
    bloc[][] cache;
}
