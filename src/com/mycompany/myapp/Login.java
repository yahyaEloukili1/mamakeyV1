/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp;

/**
 * GUI builder created Form
 *
 * @author T440
 */
public class Login extends com.codename1.ui.Form {

    public Login() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public Login(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//////////////////////////////////////////////////////////////////////////////-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();
    protected com.codename1.ui.Label gui_Label_1 = new com.codename1.ui.Label();
    protected com.codename1.ui.Label gui_Label_2 = new com.codename1.ui.Label();
    protected com.codename1.components.SpanLabel gui_Span_Label = new com.codename1.components.SpanLabel();
    protected com.codename1.ui.Label gui_Label_3 = new com.codename1.ui.Label();
    protected com.codename1.ui.TextField gui_TextField = new com.codename1.ui.TextField();
    protected com.codename1.ui.Label gui_Label_4 = new com.codename1.ui.Label();
    protected com.codename1.ui.TextField gui_Text_Field = new com.codename1.ui.TextField();
    protected com.codename1.ui.Button gui_Button = new com.codename1.ui.Button();
    protected com.codename1.ui.Label gui_Label_5 = new com.codename1.ui.Label();
    protected com.codename1.ui.Button gui_Button_1 = new com.codename1.ui.Button();
    protected com.codename1.ui.Label gui_Label_6 = new com.codename1.ui.Label();
    protected com.codename1.ui.Button gui_Button_2 = new com.codename1.ui.Button();
    protected com.codename1.ui.Label gui_Label_7 = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(false);
                setInlineStylesTheme(resourceObjectInstance);
        setInlineAllStyles("font:12.0mm; bgColor:0; bgImage:;");
        setTitle("Login");
        setName("Login");
        gui_Label.setPreferredSizeStr("164.02116mm 1.8518518mm");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setName("Label");
        gui_Label_1.setText("Welcome");
                gui_Label_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_1.setInlineAllStyles("font:4.0mm native:MainBold native:MainBold; fgColor:ffffff;");
        gui_Label_1.setName("Label_1");
        gui_Label_2.setText("Mamakey");
                gui_Label_2.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_2.setInlineAllStyles("font:4.0mm native:ItalicLight native:ItalicLight; fgColor:ffffff;");
        gui_Label_2.setName("Label_2");
        gui_Span_Label.setPreferredSizeStr("160.05292mm inherit");
        gui_Span_Label.setText("Please sign in to your account by filling the form bellow");
                gui_Span_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Span_Label.setInlineAllStyles("font:4.0mm;");
        gui_Span_Label.setName("Span_Label");
        gui_Label_3.setPreferredSizeStr("15.608466mm inherit");
        gui_Label_3.setText("Email");
                gui_Label_3.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_3.setInlineAllStyles("fgColor:ffffff;");
        gui_Label_3.setName("Label_3");
        gui_TextField.setPreferredSizeStr("157.67195mm 6.6137567mm");
                gui_TextField.setInlineStylesTheme(resourceObjectInstance);
        gui_TextField.setInlineAllStyles("border:roundRect stroke(1.0mm ffffff) +top-left +top-right +bottom-left +bottom-right 3.0mm; bgColor:ffffff;");
        gui_TextField.setName("TextField");
        gui_Label_4.setPreferredSizeStr("21.957672mm inherit");
        gui_Label_4.setText("Password");
                gui_Label_4.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_4.setInlineAllStyles("fgColor:ffffff;");
        gui_Label_4.setName("Label_4");
        gui_Text_Field.setPreferredSizeStr("157.14285mm 7.142857mm");
                gui_Text_Field.setInlineStylesTheme(resourceObjectInstance);
        gui_Text_Field.setInlineAllStyles("border:roundRect stroke(1.0mm ffffff) +top-left +top-right +bottom-left +bottom-right 3.0mm;");
        gui_Text_Field.setName("Text_Field");
        gui_Button.setText("Sign in");
                gui_Button.setInlineStylesTheme(resourceObjectInstance);
        gui_Button.setInlineAllStyles("fgColor:ffffff;");
        gui_Button.setName("Button");
        gui_Label_5.setText("Forgotten password");
                gui_Label_5.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_5.setInlineAllStyles("font:3.0mm;");
        gui_Label_5.setName("Label_5");
        gui_Button_1.setText("Click here");
                gui_Button_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_1.setInlineAllStyles("font:3.0mm native:MainBold native:MainBold; fgColor:ffffff;");
        gui_Button_1.setName("Button_1");
        gui_Label_6.setText("Don't have an account");
                gui_Label_6.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_6.setInlineAllStyles("font:3.0mm;");
        gui_Label_6.setName("Label_6");
        gui_Button_2.setText("Click here");
                gui_Button_2.setInlineStylesTheme(resourceObjectInstance);
        gui_Button_2.setInlineAllStyles("font:3.0mm native:MainBold native:MainBold; fgColor:ffffff; alignment:left;");
        gui_Button_2.setName("Button_2");
        gui_Label_7.setPreferredSizeStr("8.465609mm inherit");
        gui_Label_7.setText("");
                gui_Label_7.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_7.setName("Label_7");
        com.codename1.ui.FontImage.setMaterialIcon(gui_Label_7,"\ue0be".charAt(0));
        addComponent(gui_Label);
        addComponent(gui_Label_1);
        addComponent(gui_Label_2);
        addComponent(gui_Span_Label);
        addComponent(gui_Label_3);
        addComponent(gui_TextField);
        addComponent(gui_Label_4);
        addComponent(gui_Text_Field);
        addComponent(gui_Button);
        addComponent(gui_Label_5);
        addComponent(gui_Button_1);
        addComponent(gui_Label_6);
        addComponent(gui_Button_2);
        addComponent(gui_Label_7);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label.getParent().getLayout()).setInsets(gui_Label, "1.587302mm 8.0% auto 8.0%").setReferenceComponents(gui_Label, "-1 -1 -1 -1").setReferencePositions(gui_Label, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label_1.getParent().getLayout()).setInsets(gui_Label_1, "6.0% auto auto 0.0mm").setReferenceComponents(gui_Label_1, "0 -1 -1 0 ").setReferencePositions(gui_Label_1, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label_2.getParent().getLayout()).setInsets(gui_Label_2, "6.0% 0.0mm auto auto").setReferenceComponents(gui_Label_2, "0 0 -1 -1").setReferencePositions(gui_Label_2, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Span_Label.getParent().getLayout()).setInsets(gui_Span_Label, "21.052631% 0.0mm auto 0.0mm").setReferenceComponents(gui_Span_Label, "-1 0 -1 0 ").setReferencePositions(gui_Span_Label, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label_3.getParent().getLayout()).setInsets(gui_Label_3, "11.43617% auto auto 0.0mm").setReferenceComponents(gui_Label_3, "3 -1 -1 0 ").setReferencePositions(gui_Label_3, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_TextField.getParent().getLayout()).setInsets(gui_TextField, "2.21519% 0.0mm auto 0.0mm").setReferenceComponents(gui_TextField, "4 0 -1 0 ").setReferencePositions(gui_TextField, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label_4.getParent().getLayout()).setInsets(gui_Label_4, "2.910053mm auto auto 0.0mm").setReferenceComponents(gui_Label_4, "5 -1 -1 0 ").setReferencePositions(gui_Label_4, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Text_Field.getParent().getLayout()).setInsets(gui_Text_Field, "2.22% 0.0mm auto 0.0mm").setReferenceComponents(gui_Text_Field, "6 0 -1 0 ").setReferencePositions(gui_Text_Field, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button.getParent().getLayout()).setInsets(gui_Button, "4.6632123% auto auto 0.0mm").setReferenceComponents(gui_Button, "7 -1 -1 0 ").setReferencePositions(gui_Button, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label_5.getParent().getLayout()).setInsets(gui_Label_5, "auto 0.0mm 0.0mm auto").setReferenceComponents(gui_Label_5, "7 0 8 -1").setReferencePositions(gui_Label_5, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button_1.getParent().getLayout()).setInsets(gui_Button_1, "-4.605263% 0.0mm auto auto").setReferenceComponents(gui_Button_1, "8 0 -1 -1").setReferencePositions(gui_Button_1, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label_6.getParent().getLayout()).setInsets(gui_Label_6, "46.710526% auto 36.18421% 0.0mm").setReferenceComponents(gui_Label_6, "8 -1 -1 0 ").setReferencePositions(gui_Label_6, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button_2.getParent().getLayout()).setInsets(gui_Button_2, "-16.363636% 0.0mm auto 0.0mm").setReferenceComponents(gui_Button_2, "11 1 -1 0 ").setReferencePositions(gui_Button_2, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label_7.getParent().getLayout()).setInsets(gui_Label_7, "64.210526% 0.0mm auto auto").setReferenceComponents(gui_Label_7, "10 0 12 -1").setReferencePositions(gui_Label_7, "1.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
