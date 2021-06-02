package br.com.capsistema.mvp.main_activity.presenter;

import br.com.capsistema.mvp.main_activity.model.User;

/**
* Criado por bpn em 30/11/17.
*
* 0. No MVP, o apresentador assume a funcionalidade de "intermediário". Toda a lógica de apresentação é enviada ao apresentador.
* 1. Escuta a ação do usuário e atualizações de modelo
* 2. Atualiza o modelo e a visualização
*/
public class MainActivityPresenter {

    private User user;
    private View view;

    public MainActivityPresenter(View view) {
        this.user = new User();
        this.view = view;
    }

    public void updateFullName(String fullName){
        user.setFullName(fullName);
        view.updateUserInfoTextView(user.toString());

    }

    public void updateEmail(String email){
        user.setEmail(email);
        view.updateUserInfoTextView(user.toString());

    }

    public interface View{

        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();

    }
}
