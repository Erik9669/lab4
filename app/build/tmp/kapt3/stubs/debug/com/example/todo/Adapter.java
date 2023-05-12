package com.example.todo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/example/todo/Adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/todo/Adapter$viewHolder;", "data", "", "Lcom/example/todo/ObjectInfo;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "setData", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "viewHolder", "app_debug"})
public final class Adapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.todo.Adapter.viewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.todo.ObjectInfo> data;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.todo.Adapter.viewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.todo.Adapter.viewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.todo.ObjectInfo> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.todo.ObjectInfo> p0) {
    }
    
    public Adapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.todo.ObjectInfo> data) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/todo/Adapter$viewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "ObjectDB", "Landroid/view/View;", "(Landroid/view/View;)V", "priority", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getPriority", "()Landroid/widget/TextView;", "setPriority", "(Landroid/widget/TextView;)V", "title", "getTitle", "setTitle", "app_debug"})
    public static final class viewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView title;
        private android.widget.TextView priority;
        
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        public final void setTitle(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getPriority() {
            return null;
        }
        
        public final void setPriority(android.widget.TextView p0) {
        }
        
        public viewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View ObjectDB) {
            super(null);
        }
    }
}