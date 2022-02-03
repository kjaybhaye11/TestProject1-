package zz11;

public class Count_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello my name is Kunal";
		int count=1;
		
		for(int i=0; i<str.length()-1; i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
      /*  int count = 1;
 
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);*/
		
		
		
	}

}
