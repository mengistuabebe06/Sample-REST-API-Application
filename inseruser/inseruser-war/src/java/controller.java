/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entity.User;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import model.UserFacade;

/**
 *
 * @author Alemen
 */
@Named(value = "controller")
@SessionScoped
public class controller implements Serializable {

    /**
     * Creates a new instance of controller
     */
    @EJB
    private UserFacade userFacade;
    public User a=new User();
    public List<User> FindAll(){
        return this.userFacade.findAll();
    }

    public UserFacade getUserFacade() {
        return userFacade;
    }

    public void setUserFacade(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    public User getA() {
        return a;
    }

    public void setA(User a) {
        this.a = a;
    }
    
    public controller() {
    }
    
        public String  add()
    {
        this.userFacade.create(this.a);
        this.a = new User();
        return "index";
    }
    
}
