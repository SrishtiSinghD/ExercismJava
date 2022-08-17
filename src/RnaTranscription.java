public class RnaTranscription
{
    String transcribe(String dnaStrand) {

        if (dnaStrand.isEmpty())
        {
            return "";
        }
        int lengthOfStrand = dnaStrand.length();
        char[] rnaStrand = new char[lengthOfStrand];

        for (int i=0; i < lengthOfStrand; i++)
        {
            if (dnaStrand.charAt(i) == 'G')
            {
                rnaStrand[i] = 'C';
            }
            if (dnaStrand.charAt(i) == 'C')
            {
                rnaStrand[i] = 'G';
            }
            if (dnaStrand.charAt(i) == 'T')
            {
                rnaStrand[i] = 'A';
            }
            if (dnaStrand.charAt(i) == 'A')
            {
                rnaStrand[i] = 'U';
            }
        }
        String rna = new String(rnaStrand);
        return rna;
    }
}
