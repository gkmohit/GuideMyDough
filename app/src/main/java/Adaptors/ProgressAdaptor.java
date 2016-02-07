package Adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mohitkishore.guidemydough.R;

import Model.Goals;

/**
 * Created by AirUnknown on 16-02-06.
 */
public class ProgressAdaptor  extends BaseAdapter{

    private Context mContext;
    private Goals[] mGoals;


    public ProgressAdaptor(Context context, Goals[] goals) {
        mContext = context;
        mGoals = goals;
    }

    @Override
    public int getCount() {
        return mGoals.length;
    }



    @Override
    public Object getItem(int position) {
        return mGoals[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;


        if(convertView == null){
            //Brand new
            convertView = LayoutInflater.
                    from(mContext).inflate(R.layout.progress_list_item, null);
            holder = new ViewHolder();
            holder.progressItemImageView = (ImageView) convertView.findViewById(R.id.progressItemImageView);
            holder.progressItemNameTextView = (TextView) convertView.findViewById(R.id.progressItemNameTextView);
            holder.progressDescriptionTextView = (TextView) convertView.findViewById(R.id.progressDescriptionTextView);

            convertView.setTag(holder);

        } else{
            holder = (ViewHolder) convertView.getTag();
        }

        Goals goal = mGoals[position];
        holder.progressItemImageView.setImageResource(goal.getProgressItemNameTextViewID());
        holder.progressItemNameTextView.setText(goal.getProgressItemNameTextView().getText());
        holder.progressDescriptionTextView.setText(goal.getProgressDescriptionTextView().getText());

        return null;
    }


    private static class ViewHolder{
        ImageView progressItemImageView;
        TextView progressItemNameTextView;
        TextView progressDescriptionTextView;

    }
}
