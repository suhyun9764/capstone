package Group2.capstone_project.repository;

import Group2.capstone_project.domain.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class MemoryClientRepository implements ClientRepository{

    private static List<Client> clients = new ArrayList<>();
    @Override
    public Client save(Client client) {
        clients.add(client);
        return client;
    }

    @Override
    public Optional<Client> findId(String name, String studentNumber,String age) {
       return clients.stream().filter(client -> client.getName().equals(name)
                &&client.getStudentNumber().equals(studentNumber)
                &&client.getAge().equals(age)).findAny();

    }

    @Override
    public Optional<Client> findById(String id) {
        return clients.stream().filter(client -> client.getId().equals(id)).findAny();

    }


    @Override
    public Optional<Client> findPwd(String name, String id, String studentNumber) {
        return clients.stream().filter(client -> client.getName().equals(name)
                 &&client.getId().equals(id)
                &&client.getStudentNumber().equals(studentNumber)).findAny();
    }

    @Override
    public List<Client> findAll()
    {
        return clients;
    }
}
