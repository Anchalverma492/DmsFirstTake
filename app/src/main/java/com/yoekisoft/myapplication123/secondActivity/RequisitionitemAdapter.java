package com.yoekisoft.myapplication123.secondActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.yoekisoft.myapplication123.R;
import com.yoekisoft.myapplication123.firstActivity.RequisitionModel;
import com.yoekisoft.myapplication123.firstActivity.RequistionAdapter;

import java.util.List;

public class RequisitionitemAdapter extends RecyclerView.Adapter<RequisitionitemAdapter.ViewHolder> {


    private List<RequisitionitemModel> mitemdata;
    private LayoutInflater mInflater;
    private RequistionAdapter.ItemClickListener mClickListener;

   public RequisitionitemAdapter(Context context, List<RequisitionitemModel> mitemdata) {
        this.mInflater = LayoutInflater.from(context);
        this.mitemdata = mitemdata;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.requisitionitem_row, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RequisitionitemAdapter.ViewHolder holder, int position) {
        RequisitionitemModel requisitionitemModel = mitemdata.get(position);
        holder.itemname.setText(requisitionitemModel.getItemName());
        holder.itemno.setText(requisitionitemModel.getItemNo());
        holder.requestqty.setText(requisitionitemModel.getRequestQty());
    }

    @Override
    public int getItemCount() {
        return mitemdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView itemname, itemno, requestqty;
        CardView itemcardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemname = itemView.findViewById(R.id.itemName);
            itemno = itemView.findViewById(R.id.itemNo);
            requestqty = itemView.findViewById(R.id.requestQty);
            itemcardView = itemView.findViewById(R.id.itemcardview);
            itemcardView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            if (v == itemcardView) {
                Toast.makeText(Main2Activity.getInstance(), "......Don't Hit Me Again.....", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
