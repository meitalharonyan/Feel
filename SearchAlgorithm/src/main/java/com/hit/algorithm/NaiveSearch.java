package com.hit.algorithm;

public class NaiveSearch implements IAlgoSearch {
	public boolean Search(String pat, String txt) 
    { 
		int M = pat.length();
        int N = txt.length();
 
        /* A loop to slide pat one by one */
        for (int i = 0; i <= N - M; i++) {
 
            int j;
 
            /* For current index i, check for pattern
              match */
            for (j = 0; j < M; j++)
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;
 
            if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
            	return true;
//                System.out.println("Pattern found at index " + i);
        }
        return false;
    } 
  
    public static void main(String[] args) 
    { 
        String txt = "AABAACAADAABAAABAA"; 
        String pat = "AABA"; 
        new NaiveSearch().Search(pat, txt);
        //O(mn)
    } 

}