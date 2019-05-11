import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.contact.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.my_friend_card_name.view.*

class AddFriendFragment: Fragment(){
    companion object {
        fun newInstance():AddFriendFragment{
            return AddFriendFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.my_friends_add_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        this clearFindViewByIdCache()
    }
}