import java.util.HashMap;

public class Translate {
   // Here I declare a hashmap to have a "Character" type key with a "String" type value
    //This is how the value entered in the text input is returned and translated to braille
    private HashMap<Character, String>  frenchToBraille;

    public Translate(){
           frenchToBraille = new HashMap<>();

            frenchToBraille.put('a', "⠁");
            frenchToBraille.put('b', "⠃");
            frenchToBraille.put('c', "⠉");
            frenchToBraille.put('d', "⠙");
            frenchToBraille.put('e', "⠑");
            frenchToBraille.put('f', "⠋");
            frenchToBraille.put('g', "⠛");
            frenchToBraille.put('h', "⠓");
            frenchToBraille.put('i', "⠊");
            frenchToBraille.put('j', "⠚");
            frenchToBraille.put('k', "⠅");
            frenchToBraille.put('l', "⠇");
            frenchToBraille.put('m', "⠍");
            frenchToBraille.put('n', "⠝");
            frenchToBraille.put('o', "⠕");
            frenchToBraille.put('p', "⠏");
            frenchToBraille.put('q', "⠟");
            frenchToBraille.put('r', "⠗");
            frenchToBraille.put('s', "⠎");
            frenchToBraille.put('t', "⠞");
            frenchToBraille.put('u', "⠥");
            frenchToBraille.put('v', "⠧");
            frenchToBraille.put('w', "⠺");
            frenchToBraille.put('x', "⠭");
            frenchToBraille.put('y', "⠽");
            frenchToBraille.put('z', "⠵");
            frenchToBraille.put('A', "⠁");
            frenchToBraille.put('B', "⠃");
            frenchToBraille.put('C', "⠉");
            frenchToBraille.put('D', "⠙");
            frenchToBraille.put('E', "⠑");
            frenchToBraille.put('F', "⠋");
            frenchToBraille.put('G', "⠛");
            frenchToBraille.put('H', "⠓");
            frenchToBraille.put('I', "⠊");
            frenchToBraille.put('J', "⠚");
            frenchToBraille.put('K', "⠅");
            frenchToBraille.put('L', "⠇");
            frenchToBraille.put('M', "⠍");
            frenchToBraille.put('N', "⠝");
            frenchToBraille.put('O', "⠕");
            frenchToBraille.put('P', "⠏");
            frenchToBraille.put('Q', "⠟");
            frenchToBraille.put('R', "⠗");
            frenchToBraille.put('S', "⠎");
            frenchToBraille.put('T', "⠞");
            frenchToBraille.put('U', "⠥");
            frenchToBraille.put('V', "⠧");
            frenchToBraille.put('W', "⠺");
            frenchToBraille.put('X', "⠭");
            frenchToBraille.put('Y', "⠽");
            frenchToBraille.put('Z', "⠵");
            frenchToBraille.put(' ', "⠀");
            frenchToBraille.put('1', "⠁⠃");
            frenchToBraille.put('2', "⠁⠉");
            frenchToBraille.put('3', "⠁⠙");
            frenchToBraille.put('4', "⠁⠑");
            frenchToBraille.put('5', "⠁⠋");
            frenchToBraille.put('6', "⠁⠛");
            frenchToBraille.put('7', "⠁⠓");
            frenchToBraille.put('8', "⠁⠊");
            frenchToBraille.put('9', "⠁⠚");
            frenchToBraille.put('0', "⠚⠚");
            frenchToBraille.put('.', "⠲");
            frenchToBraille.put(',', "⠂");
            frenchToBraille.put(':', "⠒");
            frenchToBraille.put(';', "⠆");
            frenchToBraille.put('!', "⠖");
            frenchToBraille.put('?', "⠦");
            frenchToBraille.put('-', "⠤");
            frenchToBraille.put('(', "⠦⠣");
            frenchToBraille.put(')', "⠦⠜");
            frenchToBraille.put('[', "⠦⠣");
            frenchToBraille.put(']', "⠦⠜");
            frenchToBraille.put('<', "⠦⠖");
            frenchToBraille.put('>', "⠦⠴");
    }

    public String traduireToBraille(String textToTranslate){
        StringBuilder translatedText = new StringBuilder();
        for(Character letter : textToTranslate.toCharArray()){
            //Translate the letter then add it to the returned value (to be displayed in the graphical interface=> Graphic.java)
            translatedText.append(frenchToBraille.get(letter) + " ");
        }

        return translatedText.toString();
    }
    
}
