package com.ben.core.personal;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ben.R;
import com.ben.base.BaseFragment;
import com.ben.base.BaseListItemBean;
import com.ben.core.location.Location_Activity;
import com.ben.core.personal.work.NewZuzhijiagouActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonalFragment extends BaseFragment {


        @BindView(R.id.main_list)
        RecyclerView mainList;

        @Override
        protected int getLayoutId() {
                return R.layout.fragment_personal;
        }

        @Override
        protected void initView(View view) {
                List<MySection> mySections = new ArrayList<>();
                mySections.add(new MySection(true,"开发功能"));
                mySections.add(new MySection(new BaseListItemBean("Service列表", R.drawable.keybord, "", "", 0, v -> startActivity(new Intent(getActivity(), ServiceListActivity.class)))));
                mySections.add(new MySection(new BaseListItemBean("TreeList", R.drawable.treelist, "", "", 0, v -> startActivity(new Intent(getActivity(), TreeListActivity.class)))));
                mySections.add(new MySection(new BaseListItemBean("定位", R.drawable.location, "", "", 0, v -> startActivity(new Intent(getActivity(), Location_Activity.class)))));
                mySections.add(new MySection(new BaseListItemBean("数据库", R.drawable.database, "", "", 0, v -> startActivity(new Intent(getActivity(), Location_Activity.class)))));
                mySections.add(new MySection(new BaseListItemBean("网络调试", R.drawable.testnet, "", "", 0, v -> startActivity(new Intent(getActivity(), Location_Activity.class)))));
                mySections.add(new MySection(new BaseListItemBean("坐标系转换", R.drawable.testnet, "", "", 0, v -> startActivity(new Intent(getActivity(), ConvertLocationActivity.class)))));
                mySections.add(new MySection(true,"常用功能"));
                mySections.add(new MySection(new BaseListItemBean("我的关注", R.drawable.stock, "", "", 0, v -> startActivity(new Intent(getActivity(), Location_Activity.class)))));
                mySections.add(new MySection(true,"工作"));
                mySections.add(new MySection(new BaseListItemBean("综合展示", R.drawable.work, "", "", 0, v -> startActivity(new Intent(getActivity(), TestActivity.class)))));
                mySections.add(new MySection(new BaseListItemBean("指挥架构", R.drawable.work, "", "", 0, v -> startActivity(new Intent(getActivity(), NewZuzhijiagouActivity.class)))));
                FunctionsAdapter functionsAdapter = new FunctionsAdapter(R.layout.item_function_image,R.layout.item_function_header,mySections);
                mainList.setLayoutManager(new GridLayoutManager(getActivity(),3));
                mainList.setAdapter(functionsAdapter);
        }
}
