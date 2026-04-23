package ht.mbds.lafleur.tp1lafleur.llm;

public record LlmInteraction(String texteRequeteJson, String texteReponseJson, String reponseExtraite) {

    public String questionJson(){
        return texteRequeteJson;
    }

    public String reponseJson(){
        return texteReponseJson;
    }

    public String reponseExtraite(){
        return reponseExtraite;
    }
}
