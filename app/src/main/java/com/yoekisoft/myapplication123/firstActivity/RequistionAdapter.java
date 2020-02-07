package com.yoekisoft.myapplication123.firstActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.yoekisoft.myapplication123.secondActivity.Main2Activity;
import com.yoekisoft.myapplication123.R;

import java.util.List;

public class RequistionAdapter extends RecyclerView.Adapter<RequistionAdapter.ViewHolder> {


    private List<RequisitionModel> mData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    // data is passed into the constructor
    RequistionAdapter(Context context, List<RequisitionModel> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.requisition_row, parent, false);
        return new ViewHolder(view);
    }


    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        RequisitionModel requisitionModel = mData.get(position);
        holder.request.setText(requisitionModel.getRequestNo());
        holder.date.setText(requisitionModel.getDate());
        holder.createdBy.setText(requisitionModel.getCreatedBy());
        holder.status.setText(requisitionModel.getStatus());
        holder.itemcount.setText(requisitionModel.getItemsCount());
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myTextView;
        public TextView request, date, createdBy, status, itemcount;
        CardView cardView;

        ViewHolder(View itemView) {
            super(itemView);
            //    myTextView = itemView.findViewById(R.id.tvAnimalName);
            request = itemView.findViewById(R.id.requestNo);
            date = itemView.findViewById(R.id.dateshow);
            createdBy = itemView.findViewById(R.id.createdBy);
            status = itemView.findViewById(R.id.status);
            itemcount = itemView.findViewById(R.id.itemcount);
            cardView = itemView.findViewById(R.id.cardview);
            cardView.setOnClickListener(this);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (view == cardView) {
                MainActivity.getInstance().startActivity(new Intent(MainActivity.getInstance(), Main2Activity.class)
                        .putExtra("RequestNo",mData.get(getAdapterPosition()).getRequestNo()));

            }
        }
    }

    // convenience method for getting data at click position
    String getItem(int id) {
        //return mData.get(id);
        return null;
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);

    }

}
