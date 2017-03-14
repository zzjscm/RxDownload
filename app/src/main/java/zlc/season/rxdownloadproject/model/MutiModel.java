package zlc.season.rxdownloadproject.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by xieqi on 2017/3/14.
 */

public class MutiModel extends BaseObservable {
	private String url = "";
	private String state = "";
	private boolean control = true;

	@Bindable
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
//		notifyPropertyChanged(BR.url);
	}

	@Bindable
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
//		notifyPropertyChanged(BR.state);
	}

	@Bindable
	public boolean isControl() {
		return control;
	}

	public void setControl(boolean control) {
		this.control = control;
//		notifyPropertyChanged(BR.control);
	}
}
