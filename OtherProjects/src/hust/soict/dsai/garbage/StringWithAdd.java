package hust.soict.dsai.garbage;

import java.io.IOException;

public class StringWithAdd implements Appendable {
    private String data;

    public StringWithAdd() {
        data = "";
    }

    @Override
    public Appendable append(CharSequence charSequence) throws IOException {
        data += charSequence.toString();
        return null;
    }

    @Override
    public Appendable append(CharSequence charSequence, int i, int i1) throws IOException {
        for (int j = i; j < i1; j++) {
            this.append(charSequence.charAt(j));
        }
        return null;
    }

    @Override
    public Appendable append(char c) throws IOException {
        data += c;
        return null;
    }
}
