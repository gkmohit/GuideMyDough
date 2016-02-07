package Model;

import android.widget.ImageView;
import android.widget.TextView;

import com.mohitkishore.guidemydough.R;

/**
 * Created by AirUnknown on 16-02-06.
 */
public class Goals {

    ImageView mProgressItemImageView;
    TextView mProgressItemNameTextView;
    TextView mProgressDescriptionTextView;

    public Goals(ImageView progressItemImageView, TextView progressItemNameTextView, TextView progressDescriptionTextView) {
        mProgressItemImageView = progressItemImageView;
        mProgressItemNameTextView = progressItemNameTextView;
        mProgressDescriptionTextView = progressDescriptionTextView;
    }

    public ImageView getProgressItemImageView() {
        return mProgressItemImageView;
    }

    public void setProgressItemImageView(ImageView progressItemImageView) {
        mProgressItemImageView = progressItemImageView;
    }

    public TextView getProgressItemNameTextView() {
        return mProgressItemNameTextView;
    }

    public void setProgressItemNameTextView(TextView progressItemNameTextView) {
        mProgressItemNameTextView = progressItemNameTextView;
    }

    public TextView getProgressDescriptionTextView() {
        return mProgressDescriptionTextView;
    }

    public void setProgressDescriptionTextView(TextView progressDescriptionTextView) {
        mProgressDescriptionTextView = progressDescriptionTextView;
    }

    public int getProgressItemNameTextViewID(){
        int returnVal;
        if( mProgressItemNameTextView.getText().toString().equalsIgnoreCase("Home loan") ){
            returnVal = R.drawable.goal_home;
        } else if( mProgressItemNameTextView.getText().toString().equalsIgnoreCase("Vacation") ){
            returnVal = R.drawable.goal_vaccation;
        } else  {
            returnVal = R.drawable.goal_car;
        }
        return returnVal;
    }
}
