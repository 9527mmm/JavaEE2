package service;

import dao.PersonDao;
import po.Person;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/18/ 11:18
 * @Description:
 * @GitHup: 957kk
 */
public class PersonService {
    private PersonDao personDao = new PersonDao();

    public boolean add(Person person) {

        return personDao.add(person);
    }

    public boolean isExists(String id) {
        boolean exists = false;
        Person[] per = personDao.findAllPerson();
        for (int i = 0; i < per.length; i++) {
            Person person = per[i];
            if (person != null && person.getId().equals(id)) {
                exists = true;
                break;
            }
        }
        return exists;
    }


    public void delete(String id) {
        personDao.delete(id);
    }

    public void update(String id, Person person) {
        personDao.update(id,person);
    }

    public Person[] select() {

       Person[] person=personDao.select();
        for (int i = 0; i < person.length; i++) {
            Person per = person[i];
            if(per!=null){
                return person;
            }
        }
        return null;

    }
}
