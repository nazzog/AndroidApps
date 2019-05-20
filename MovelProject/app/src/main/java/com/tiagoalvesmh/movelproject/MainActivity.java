package com.tiagoalvesmh.movelproject;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    //Recupera o nó Raiz como referencia.
    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();

    //Recupera o objeto que permite manipular os usuários.
    private FirebaseAuth usuario = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario.createUserWithEmailAndPassword("tiagoalvesmh@gmail.com", "senha123")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){

                        }
                    }
                });



        /*
        DatabaseReference c1 = referencia.child("clientes");

        //Evento para verificar alterações em "clientes"
        c1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        Cliente cliente = new Cliente();

        cliente.setNome("Bibiana");
        cliente.setSobrenome("Argenta");
        cliente.setIdade(32);

        c1.child("001").setValue(cliente);
        */
    }
}