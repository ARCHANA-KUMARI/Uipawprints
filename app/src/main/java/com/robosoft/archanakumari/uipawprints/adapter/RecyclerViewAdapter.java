package com.robosoft.archanakumari.uipawprints.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.robosoft.archanakumari.uipawprints.R;

/**
 * Created by archanakumari on 3/1/16.
 */
public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.LayoutHolder>{

  private Context mContext;
  private View mOneRow;
  private static int sCountofChildOne = 0;
    private static int sCountofChildTwo = 0;

    private int mListOfImagesofChildone[] = {R.drawable.lg,R.drawable.lv,R.drawable.leftyellow,R.drawable.lgreen};
  private int mListOfImagesofChildtwo[] = {R.drawable.rg,R.drawable.rv,R.drawable.ryello,R.drawable.rgreen};
    public RecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public LayoutHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType%2==0) {
            mOneRow = LayoutInflater.from(mContext).inflate(R.layout.child, parent, false);
            Log.i("HEllo", "I am in onCreateViewHOlder");

        }
        else
        {
            mOneRow = LayoutInflater.from(mContext).inflate(R.layout.childtwo, parent, false);
        }
        LayoutHolder viewHolder = new LayoutHolder(mOneRow);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(LayoutHolder holder, int position) {
     if(position%2==0){
         holder.mTextNameofchildone.setText("Milkbone treat");
         holder.mTextDescriptionofchildone.setText("OCT 15 ! 10:36 AM");
         holder.mImageofChildone.setImageResource(mListOfImagesofChildone[sCountofChildOne]);
         sCountofChildOne++;

     }else
     {  holder.mTextNameofchildtwo.setText("Milkbone treat");
         holder.mTextDescriptionofchiltwo.setText("OCT 15 ! 10:36 AM");

         holder.mImageofChiltwo.setImageResource(mListOfImagesofChildtwo[sCountofChildTwo]);
         sCountofChildTwo++;
     }

    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
    @Override
    public int getItemCount() {
        return 7;
    }

    class  LayoutHolder extends RecyclerView.ViewHolder{

        private TextView mTextNameofchildone;
        private TextView mTextDescriptionofchildone;
        private TextView mTextNameofchildtwo;
        private TextView mTextDescriptionofchiltwo;
        private ImageView mImageofChildone;
        private ImageView mImageofChiltwo;

        public LayoutHolder(View itemView) {
            super(itemView);
            mTextNameofchildone = (TextView) itemView.findViewById(R.id.textone);
            mTextDescriptionofchildone = (TextView) itemView.findViewById(R.id.texttwo);
            mTextNameofchildtwo = (TextView) itemView.findViewById(R.id.textoneofchildtwo);
            mTextDescriptionofchiltwo = (TextView) itemView.findViewById(R.id.texttwoofchildtwo);
            mImageofChildone = (ImageView) itemView.findViewById(R.id.imageofchildone);
            mImageofChiltwo = (ImageView) itemView.findViewById(R.id.imageofchildtwo);

        }
    }
}
