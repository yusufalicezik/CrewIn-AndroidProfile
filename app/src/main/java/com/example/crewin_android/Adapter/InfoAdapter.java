package com.example.crewin_android.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.crewin_android.Model.ResponseModel;
import com.example.crewin_android.R;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class InfoAdapter extends  RecyclerView.Adapter<InfoAdapter.InfoAdapterViewHolder>  {
    private ArrayList<ResponseModel> responseList;
    Context mContext;
    public InfoAdapter(ArrayList<ResponseModel> responseList, Context context) {
        this.responseList = responseList;
        this.mContext=context;
    }

    @NonNull
    @Override
    public InfoAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.info_desc_list,parent,false);
        return new InfoAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InfoAdapterViewHolder holder, int position) {
        if (this.responseList.get(position).getHeader() == true){
            holder.infoDesc.setText("");
            holder.infoName.setText(responseList.get(position).getInfoType());
            holder.iconImage.setImageResource(R.drawable.infotitleimage);
            holder.infoName.setTextSize(pxFromDp(11, mContext));
        }else{
            if(responseList.get(position).getInfoName().equalsIgnoreCase("Hakkında")){
                holder.infoDesc.setText("");
                holder.infoName.setText(responseList.get(position).getInfoDesc());
            }else{
                holder.infoDesc.setText(responseList.get(position).getInfoDesc());
                holder.infoName.setText(responseList.get(position).getInfoName());
            }
            holder.iconImage.setImageResource(R.drawable.info_desc_line_image);
            holder.infoName.setTextSize(pxFromDp(5, mContext));
        }
    }

    @Override
    public int getItemCount() {
        return responseList.size();
    }

    public static float pxFromDp(float dp, Context mContext) {
        return dp * mContext.getResources().getDisplayMetrics().density;
    }
    public class InfoAdapterViewHolder extends RecyclerView.ViewHolder {
        public TextView infoName;
        public TextView infoDesc;
        public ImageView iconImage;
        public InfoAdapterViewHolder(View itemView){
            super(itemView);
            infoName=itemView.findViewById(R.id.txtInfoName);
            infoDesc=itemView.findViewById(R.id.txtInfoDessc);
            iconImage=itemView.findViewById(R.id.iconImage);
        }
    }
}