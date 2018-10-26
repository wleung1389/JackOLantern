public class JackOLantern extends java.lang.Object
{
    private String[][] faceFeatures;
    public JackOLantern(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }
    public void edit(String replace, int row, int column)
    {
        faceFeatures[row][column] = replace;
    }
    public void fill(String str)
    {
        int x = 0;
        for(int i = 0; i < faceFeatures.length; i++)
        {
            for(int c = 0; c < faceFeatures[i].length; c++)
            {
                faceFeatures[i][c] = str.substring(x,x+1);
                x++;
            }
        }
    }
    public String toString()
    {
        String line = "";
        for(int i = 0; i < faceFeatures.length; i++)
        {
            for(int c = 0; c < faceFeatures[i].length; c++)
            {
                line += faceFeatures[i][c];
            }
            line += "\n";
        }
        return line;
    }
}
