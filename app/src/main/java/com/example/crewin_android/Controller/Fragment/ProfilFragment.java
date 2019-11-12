package com.example.crewin_android.Controller.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.crewin_android.Adapter.InfoAdapter;
import com.example.crewin_android.Model.ResponseModel;
import com.example.crewin_android.R;
import com.example.crewin_android.Service.ApiClient;
import com.example.crewin_android.Service.RestInterface;
import com.example.crewin_android.Model.User;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfilFragment extends Fragment {

    RecyclerView infoListView;
    ArrayList<ResponseModel> responseList = new ArrayList<ResponseModel>();
    CircleImageView headerImageView, profileImageView;
    TextView headerUsername, profileUserName;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.frament_profile, container, false);
        infoListView = root.findViewById(R.id.info_list);
        headerImageView = root.findViewById(R.id.header_profile_image);
        headerUsername = root.findViewById(R.id.header_username);
        profileImageView = root.findViewById(R.id.profile_image);
        profileUserName = root.findViewById(R.id.profile_username);
        ArrayList<String> list = new ArrayList<String>();

        getDataFromService();
        return root;
    }

    public void getDataFromService(){
        RestInterface restInterface = ApiClient.getClient().create(RestInterface.class);
        Call<List<User>> call = restInterface.getUser(2);
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                System.out.printf("success");
                System.out.println(response.body().get(0).getAD());
                fillInfo(response.body());
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                System.out.println("error"+t);
            }
        });
    }
    public void fillInfo(List<User> userList){
        responseList.clear();
            if(userList.size() > 0) {
                User responseUser = userList.get(0);
                responseList.add(new ResponseModel(true, "Kişisel Bilgiler", "",""));
                responseList.add(new ResponseModel(false, "", "İsim",responseUser.getAD()));
                responseList.add(new ResponseModel(false, "", "Soyad",responseUser.getSOYADI()));
                responseList.add(new ResponseModel(false, "", "Pozisyon",responseUser.getPOZISYON()));
                responseList.add(new ResponseModel(false, "", "E-Mail",responseUser.getEMAIL()));
                responseList.add(new ResponseModel(false, "", "Doğum Tarihi",responseUser.getDOGUMTARIHI()));
                responseList.add(new ResponseModel(false, "", "TC No",String.valueOf(responseUser.getTCNO())));
                responseList.add(new ResponseModel(false, "", "Medeni Durum",responseUser.getMEDENIDURUMU()));
                responseList.add(new ResponseModel(false, "", "Cinsiyet",responseUser.getCINSIYET()));
                responseList.add(new ResponseModel(false, "", "Askerlik Durumu",responseUser.getASKERLIKDURUMU()));
                responseList.add(new ResponseModel(true, "İletişim Bilgileri", "",""));
                responseList.add(new ResponseModel(false, "", "Ülke",responseUser.getULKEADI()));
                responseList.add(new ResponseModel(false, "", "Şehir",responseUser.getSEHIRADI()));
                responseList.add(new ResponseModel(false, "", "Ev Telefonu",responseUser.getEVTEL()));
                responseList.add(new ResponseModel(false, "", "Cep Telefonu",responseUser.getCEPTEL()));
                responseList.add(new ResponseModel(false, "", "Facebook",responseUser.getFACEBOOK()));
                responseList.add(new ResponseModel(false, "", "Linkedin",responseUser.getLINKEDIN()));
                responseList.add(new ResponseModel(true, "Hakkında", "",""));
                responseList.add(new ResponseModel(false, "", "Hakkında",responseUser.getHAKKINDA()));
        }
        InfoAdapter adapter = new InfoAdapter(responseList, getActivity());
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        linearLayoutManager.setStackFromEnd(false);
        infoListView.setHasFixedSize(true);
        infoListView.setLayoutManager(linearLayoutManager);
        infoListView.setAdapter(adapter);
        Glide.with(this).load(userList.get(0).getRESIMURL()).into(headerImageView);
        Glide.with(this).load(userList.get(0).getRESIMURL()).into(profileImageView);
        headerUsername.setText(userList.get(0).getKULLANICIADI());
        profileUserName.setText(userList.get(0).getKULLANICIADI());



    }




}
