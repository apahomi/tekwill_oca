class exercise_11
{

    public static void main(String[] args)
    {
        String names = "John,Steve,Bob,Anna,Diana,George,Dodon,Plahotniuc";
        StringBuilder stringB = new StringBuilder();
        int init = 0;

        String[] arrNames = names.split(",");

        for (String string : arrNames)
        {
            StringBuilder tmp = new StringBuilder(string);
            stringB.append(tmp.reverse());

            if(init < arrNames.length);
            {
                stringB.append(",");

            }
            init++;

        }
        System.out.println(stringB);
    }
}
